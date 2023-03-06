import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { Floor2Component } from './floor2.component';

describe('Floor2Component', () => {
  let component: Floor2Component;
  let fixture: ComponentFixture<Floor2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      declarations: [ Floor2Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Floor2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
