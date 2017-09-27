import { TestBed, inject } from '@angular/core/testing';

import { CivilStatusService } from './civil-status.service';

describe('CivilStatusService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CivilStatusService]
    });
  });

  it('should be created', inject([CivilStatusService], (service: CivilStatusService) => {
    expect(service).toBeTruthy();
  }));
});
