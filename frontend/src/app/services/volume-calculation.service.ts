import { Injectable } from '@angular/core';
import {MovementPattern} from "../interfaces/movement-pattern.interface";
import {MOVEMENT_PATTERNS_MOCK} from "../constants/movement-pattern.constants";
import {MuscleGroupVolume} from "../interfaces/muscle-group-volume.interface";
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {firstValueFrom} from "rxjs";
import {MuscleGroup} from "../enums/muscle-group.enum";
import {MUSCLE_GROUPS_MOCK} from "../constants/muscle-group.constants";
import {GenerateMuscleGroupsVolumeService} from "./local/generate-muscle-groups-volume.service";

@Injectable({
  providedIn: 'root'
})
export class VolumeCalculationService {

  constructor(private httpClient: HttpClient,
              private generateMuscleGroupsVolumeService: GenerateMuscleGroupsVolumeService) { }

  async readMovementPatterns(): Promise<MovementPattern[]> {
    if (environment.apiUrl) {
      const url = `${environment.apiUrl}/movementPatterns`;
      return firstValueFrom(this.httpClient.get<MovementPattern[]>(url));
    } else {
      return MOVEMENT_PATTERNS_MOCK;
    }
  }

  async readMuscleGroups(): Promise<MuscleGroup[]> {
    if (environment.apiUrl) {
      const url = `${environment.apiUrl}/muscleGroups`;
      return firstValueFrom(this.httpClient.get<MuscleGroup[]>(url));
    } else {
      return MUSCLE_GROUPS_MOCK;
    }
  }

  async calculateMuscleGroupsVolumeForMovementPatterns(movementPatterns: MovementPattern[]): Promise<MuscleGroupVolume[]> {
    if (environment.apiUrl) {
      const url = `${environment.apiUrl}/muscleGroupsVolume`;
      return firstValueFrom(this.httpClient.post<MuscleGroupVolume[]>(url, movementPatterns));
    } else {
      return this.generateMuscleGroupsVolumeService.generateMuscleGroupsVolume(movementPatterns);
    }
  }

}
