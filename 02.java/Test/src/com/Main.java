package com;

//포유류 클래스
class Mammal {
 void makeSound() {
     System.out.println("포유류는 소리를 냅니다.");
 }
}

//어류 인터페이스
interface Fish {
 void swim();
}

//고래 클래스 : 포유류를 상속, 어류 인터페이스 구현
class Whale extends Mammal implements Fish {

 // 소리내는 특징 오버라이딩
 @Override
 void makeSound() {
     System.out.println("고래는 포유류처럼 소리를 냅니다.");
 }

 // 헤엄치는 특징 오버라이딩
 @Override
 public void swim() {
     System.out.println("고래는 어류처럼 헤엄칩니다.");
 }
}

//실행 클래스
public class Main {
 public static void main(String[] args) {
     Whale whale = new Whale();
     whale.makeSound();  // 고래 포유류 특징 (소리)
     whale.swim();       // 고래 어류 특징 (헤엄)
 }
}


