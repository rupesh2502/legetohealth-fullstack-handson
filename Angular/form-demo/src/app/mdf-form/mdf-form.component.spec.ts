import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdfFormComponent } from './mdf-form.component';

describe('MdfFormComponent', () => {
  let component: MdfFormComponent;
  let fixture: ComponentFixture<MdfFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MdfFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MdfFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
