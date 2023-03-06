import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { Floor1Component } from './floor1.component';

describe('Floor1Component', () => {
  let component: Floor1Component;
  let fixture: ComponentFixture<Floor1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      declarations: [ Floor1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Floor1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
