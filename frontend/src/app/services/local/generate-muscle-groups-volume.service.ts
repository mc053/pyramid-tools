import { Injectable } from '@angular/core';
import {InitMuscleGroupsVolumeMapService} from "./init-muscle-groups-volume-map.service";
import {CalculateMuscleGroupsVolumeService} from "./calculate-muscle-groups-volume.service";
import {MovementPattern} from "../../interfaces/movement-pattern.interface";
import {MuscleGroupVolume} from "../../interfaces/muscle-group-volume.interface";

@Injectable({
  providedIn: 'root'
})
export class GenerateMuscleGroupsVolumeService {

  constructor(private initMuscleGroupsVolumeMapService: InitMuscleGroupsVolumeMapService,
              private calculateMuscleGroupsVolumeService: CalculateMuscleGroupsVolumeService) { }

  generateMuscleGroupsVolume(movementPatterns: MovementPattern[]): MuscleGroupVolume[] {
    let muscleGroupsVolumeMap = this.initMuscleGroupsVolumeMapService.initMuscleGroupsVolumeMap();

    return this.calculateMuscleGroupsVolumeService.calculateMuscleGroupsVolume(muscleGroupsVolumeMap, movementPatterns);
  }

}
