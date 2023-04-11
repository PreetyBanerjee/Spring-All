import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplicationSuccessfulComponent } from './application-successful.component';

describe('ApplicationSuccessfulComponent', () => {
  let component: ApplicationSuccessfulComponent;
  let fixture: ComponentFixture<ApplicationSuccessfulComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApplicationSuccessfulComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ApplicationSuccessfulComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
