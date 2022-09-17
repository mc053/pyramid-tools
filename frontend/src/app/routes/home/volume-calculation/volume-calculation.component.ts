import {Component, OnInit, ViewChild} from '@angular/core';
import {VolumeCalculationService} from "../../../services/volume-calculation.service";
import {MatTableDataSource} from "@angular/material/table";
import {MovementPattern} from "../../../interfaces/movement-pattern.interface";
import {MatSort} from "@angular/material/sort";

@Component({
  selector: 'app-volume-calculation',
  templateUrl: './volume-calculation.component.html',
  styleUrls: ['./volume-calculation.component.scss']
})
export class VolumeCalculationComponent implements OnInit {
  @ViewChild(MatSort) sort!: MatSort;

  public movementPatterns!: MatTableDataSource<MovementPattern>;
  public displayedColumns: string[] = ['name', 'primaryMuscleGroups', 'secondaryMuscleGroups'];

  constructor(private volumeCalculationService: VolumeCalculationService) { }

  async ngOnInit(): Promise<void> {
    await this.getAllMovementPatterns();
  }

  async getAllMovementPatterns() {
    const movementPatterns = await this.volumeCalculationService.readMovementPatterns();
    this.movementPatterns = new MatTableDataSource(movementPatterns);
    this.movementPatterns.sort = this.sort;
  }

}
