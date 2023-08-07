package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.*;

// import sec12.exam03_import.hankook.Tire; // Tire tire3 = new Tire(); - 사용

import sec12.exam03_import.hyundai.*; // ctrl + shift + O
/* import sec12.exam03_import.hyundai.Engine;
import sec12.exam03_import.hyundai.A; */
import sec12.exam03_import.kumho.*;



public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	// Tire tire3 = new Tire();
	sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
	sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
}
