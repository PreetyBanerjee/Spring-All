import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RechargeSuccessfulComponent } from './recharge-successful.component';

describe('RechargeSuccessfulComponent', () => {
  let component: RechargeSuccessfulComponent;
  let fixture: ComponentFixture<RechargeSuccessfulComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RechargeSuccessfulComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RechargeSuccessfulComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
