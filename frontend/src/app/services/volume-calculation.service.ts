import { Injectable } from '@angular/core';
import {MovementPattern} from "../interfaces/movement-pattern.interface";
import {MOVEMENT_PATTERNS_MOCK} from "../constants/movement-pattern.constants";

@Injectable({
  providedIn: 'root'
})
export class VolumeCalculationService {

  constructor() { }

  async readMovementPatterns(): Promise<MovementPattern[]> {
    return MOVEMENT_PATTERNS_MOCK;
  }
}
