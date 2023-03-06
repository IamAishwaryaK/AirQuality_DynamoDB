import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { Floor3Component } from './floor3.component';

describe('Floor3Component', () => {
  let component: Floor3Component;
  let fixture: ComponentFixture<Floor3Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      declarations: [ Floor3Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Floor3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
