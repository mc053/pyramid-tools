import {Component, OnInit, ViewChild} from '@angular/core';
import {VolumeCalculationService} from "../../../services/volume-calculation.service";
import {MatTableDataSource} from "@angular/material/table";
import {MovementPattern} from "../../../interfaces/movement-pattern.interface";
import {MatSort} from "@angular/material/sort";
import {MuscleGroupVolume} from "../../../interfaces/muscle-group-volume.interface";
import {MatPaginator} from "@angular/material/paginator";
import {MatDialog} from "@angular/material/dialog";
import {IsolationExerciseAddDialogComponent} from "../../../components/isolation-exercise-add-dialog/isolation-exercise-add-dialog.component";

@Component({
  selector: 'app-volume-calculation',
  templateUrl: './volume-calculation.component.html',
  styleUrls: ['./volume-calculation.component.scss']
})
export class VolumeCalculationComponent implements OnInit {
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  public movementPatterns!: MatTableDataSource<MovementPattern>;
  public muscleGroupsVolume!: MatTableDataSource<MuscleGroupVolume>;
  public displayedColumnsForMovementPatterns: string[] = ['name', 'primaryMuscleGroups', 'secondaryMuscleGroups', 'amountOfSets'];
  public displayedColumnsForMuscleGroupsVolume: string[] = ['name', 'sets', 'directWork', 'indirectWork'];

  constructor(private volumeCalculationService: VolumeCalculationService, private dialog: MatDialog) { }

  async ngOnInit(): Promise<void> {
    await this.getAllMovementPatterns();
  }

  async getAllMovementPatterns() {
    const movementPatterns = await this.volumeCalculationService.readMovementPatterns();
    this.movementPatterns = new MatTableDataSource(movementPatterns);
    this.movementPatterns.sort = this.sort;
    this.movementPatterns.paginator = this.paginator;
  }

  async onCalculateVolume() {
    const muscleGroupsVolume = await this.volumeCalculationService.calculateMuscleGroupsVolumeForMovementPatterns(this.movementPatterns.data);
    this.muscleGroupsVolume = new MatTableDataSource(muscleGroupsVolume);
    this.muscleGroupsVolume.sort = this.sort;
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.movementPatterns.filter = filterValue.trim().toLowerCase();

    if (this.movementPatterns.paginator) {
      this.movementPatterns.paginator.firstPage();
    }
  }

  onAddIsolationExercise() {
    const dialogRef = this.dialog.open(IsolationExerciseAddDialogComponent, {
      width: '400px',
      maxWidth: '90vw',
      restoreFocus: false
    });
  }
}
