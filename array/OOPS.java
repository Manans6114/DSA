


// public class OOPS{

//     public static void main(String args[]){
        
//         Pen p1 = new Pen();  //created  a pen object called p1

//         p1.setColor("Blue");
//         System.out.println(p1.getColor());

//         p1.setTip(5);
//         System.out.println(p1.getTip());

//         // p1.setColor("red");              // like this also we can change the colour of Pen;
//         // System.out.println(p1.getColor());

//         BankAccount myAcc = new BankAccount();

//         myAcc.setPassword("manan");
        
       


//     }

// }

// class BankAccount{
//     String username;
//     private String password;
    
//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }


 class Pen {
    
    private String color;
    private int tip;

     String getColor(){
          return this.color; 
    }

     int getTip(){
          return this.tip;
    }
    

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }


}



//                     Constructor:



// public class OOPS{
//     public static void main(String args[]){
//         Student s1 = new Student("Manan");    //calling constructor
     
        
//         System.out.println(s1.name);
//     }
// }

// class Student{

//     String name;
//     int roll;

//     Student(String name){
//         this.name = name;
       
//     }
// }






//    Other way to initialize Constructor:


// public class OOPS{
//     public static void main(String args[]){
 
//         Student s1 = new Student();     //calling constructor
      
//     }
// }
// class Student{

//     String name;
//     int roll;

//     Student(){
//         System.out.println("Constructor is called.......");
//     }
// }



//V-6


//                Types of Constructor:



//  non parameterised constructor.



// public class OOPS{
//     public static void main(String args[]){
 
//         Student s1 = new Student();     //calling constructor
      
//     }
// }

// class Student{

//     String name;
//     int roll;

//     Student(){           //non parameterised constructor.

//         System.out.println("Constructor is called.......");
//     }
// }





//  parameterized Constructor: as we are initializing name here



// public class OOPS{
//     public static void main(String args[]){
//         Student s1 = new Student();     //calling constructor non parameterized
//         Student s2 = new Student("Manan");
//         Student s3 = new Student(12345);

//         System.out.println(s2.name);
//         System.out.println(s3.roll);
        
//     }
// }

// class Student{

//     String name;
//     int roll;

//     Student(){
        
//         System.out.println("Manan is the best Coder in India.");
//     }

//     Student(String name){    //parameterised
//         this.name = name;
       
//     }

//     Student(int roll){
//         this.roll = roll;
//     }
// }




// other way to call constructor:


// public class OOPS{
//     public static void main(String args[]){
//         Student s1 = new Student();     //calling constructor
//         Student s2 = new Student();
//         Student s3 = new Student();
        
//         s2.name = "manan";
//         s3.roll = 5555;
//         System.out.println(s2.name);
//         System.out.println(s3.roll);
        
//     }
// }

// class Student{

//     String name;
//     int roll;

//     Student(){
        
//         System.out.println("Manan is the best Coder in India.");
//     }

//     Student(String name){    //parameterised
//         this.name = name;
       
//     }

//     Student(int roll){
//         this.roll = roll;
//     }
// }



//   Copy Contructor:


// public class OOPS{

//     public static void main(String args[]){

//         Student s1 = new Student();     //calling constructor

//         s1.name = "manan";  
//         s1.roll = 1111;  
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         // System.out.println(s1.name);
 
    

//         Student s2 = new Student(s1);

//         s2.password = "xyz";

//         for(int i=0; i<3; i++){
//             System.out.println(s2.marks[i]);

//             // s1.marks[2] = 100;
//         }
//     }
// }

// class Student{

//     String name;
//     int roll;
//     String password;
//     int marks[];

//     //  shallow copy constructor:

//     Student(Student s1){

//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
//     }

//     Student(){

//         marks = new int[3];
//         System.out.println("Manan is the best Coder in India.");
//     }

//     Student(String name){    //parameterised

//         marks = new int[3];
//         this.name = name;
//     }

//     Student(int roll){

//         marks = new int[3];
//         this.roll = roll;
//     }
// }



//       Shallow and Deep Copy:


// public class OOPS{

//     public static void main(String args[]){

//         Student s1 = new Student();     //calling constructor

//         s1.name = "manan";  
//         s1.roll = 1111;  
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         Student s2 = new Student(s1);

//         s2.password = "xyz";

//         for(int i=0; i<3; i++){
//             System.out.println(s2.marks[i]);

//             // s1.marks[2] = 100;
//         }
//     }
// }

// class Student{

//     String name;
//     int roll;
//     String password;
//     int marks[];

//     //Deep Copy Constructor:
    
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;

//         for(int i=0;i<marks.length;i++){
//             this.marks[i] = s1.marks[i];
//         }

//     }

//     Student(){

//         marks = new int[3];
//         System.out.println("Manan is the best Coder in India.");
//     }

//     Student(String name){    //parameterised

//         marks = new int[3];
//         this.name = name;
//     }

//     Student(int roll){

//         marks = new int[3];
//         this.roll = roll;
//     }
// }




//V- 10
//INHERITENCE

// Single level inheritence



// public class OOPS{
//     public static void main(String args[]){

//         Fish Shark = new Fish();
//         Shark.swim();

//         Shark.color = "white";

//         Shark.fins = 5;
//         System.out.println(Shark.fins);
//         System.out.println(Shark.color);

//     }
// }

// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }

// }

// class Fish extends Animal{

//     int fins;

//     void swim(){
//     System.out.println("fish can swim");
//     }
// }


// Multi level inheritence:



// public class OOPS{
//     public static void main(String agrs[]){

//         Dog dobby = new Dog();

//         dobby.eat();
//         dobby.legs = 1111;
//         System.out.println(dobby.legs);

//     }
// }

// class Animal{
//     String color;

//     void eat(){
//         System.out.println("EATS");
//     }
//     void breathe(){
//         System.out.println("i can breathe.");
//     }

// }

// class Mammel extends Animal{

//     int legs;
// }

// class Dog extends Mammel{

//     String breed;

// }







// public class OOPS{

//     public static void main(String args[]){

//         Labra labu = new Labra();

//         labu.swim();

//         labu.color  = "Red";

//         System.out.println(labu.color);


//     }
// }

// class Animal{

//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void swim(){

//         System.out.println("i can swim");
//     }

// }

// class Dog extends Animal{

//     int legs;
//     String breed;

// }

// class Labra extends Dog{

//     void me(){
//         System.out.println("manan");
//     }

// }





//Heirarchial Inheritence:




// public class OOPS{

//     public static void main(String args[]){

//         Mammel human = new Mammel();

//         human.color = "white";
//         System.out.println(human.color);

//         human.eat();
        
//     }
// }

// class Animal{

//     String color;

//     void eat(){
//         System.out.println("eats");

//     }

//     void breathe(){
//         System.out.println("i can breathe");
//     }

// }

// class Bird extends Animal{

//     void fly(){
//         System.out.println("can fly");
//     }
// }

// class Fish extends Animal{

//     void swim(){
//         System.out.println("i can swim");
//     }
// }

// class Mammel extends Animal{
    
//     void walk(){
//     System.out.println("i can walk");
//     }
// }




//Hybrid inheritence:



// public class OOPS{

//     public static void main(String args[]){

//         Dog happy = new Dog();

//         happy.eat();

//         happy.breathe();

//         Tuna goldy = new Tuna();

//         goldy.fins = 5;

//         System.out.println(goldy.fins);



//     }
// }




// class Animal{

//     String color;

//     void eat(){
//         System.out.println("eats");

//     }

//     void breathe(){
//         System.out.println("i can breathe");
//     }

// }





// class Fish extends Animal{

//     void swim(){
//         System.out.println("i can swim");

//     }
// }

// class Tuna extends Fish{

//     int fins;
// }

// class Shark extends Fish{

//     void sharp(){
//     System.out.println("its sharp");

//     }
// }





// class Mammel extends Animal{

//     void walk(){
//         System.out.println("can walk");
//     }

// }

// class Dog extends Mammel{

//     String breed;
// }

// class Human extends Mammel{

//     void how(){
//         System.out.println("hows");
//     }
// }

// class Cat extends Mammel{

//     String type;

// }



//Method overloading:


// public class OOPS{
//     public static void main(String args[]){

//         Calculator calc = new Calculator();


//         System.out.println(calc.sum(1,2));
//         System.out.println(calc.sum(1,2,3));
//         System.out.println(calc.sum((float)1.2,(float)2.4));


//     }
// }


// class Calculator{

//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float a, float b){
//         return a+b;
//         }

//     int sum(int a , int b, int c){
//         return a+b+c;
//     }
// }




// V - 17

// Method overriding:


// public class OOPS{
//     public static void main(String args[]){

//         Deer d = new Deer();
//         Animal a = new Deer();
//         Animal b = new Animal();

//         a.eat();
//         b.eat();
//         d.eat();


//     }
// }

// class Animal{

//     void eat(){
//         System.out.println("eats anything");
//     }

// }

// class Deer extends Animal{

//     void eat(){
//         System.out.println("eats grass");
//     }
// }





//packages in java:



// inbuilt

// import java.util.*;
// public class OOPS{

//     public static void main(String args[]){

//         Scanner sc  = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a+b;

//         System.out.println(sum);

//     }
// }


// V-20


//Abstraction:



// Abstract Classes :


// public class OOPS{
     
//     public static void main(String args[]){

//         Horse h = new Horse();

//         h.eat();
//         h.walk();

//         Chicken c = new Chicken();

//         c.eat();
//         c.walk();


//     }
// }

// abstract class Animal{

//     void eat(){
//         System.out.println("eats a lot");
//     }

//     abstract void walk();
// }

// class Horse extends Animal{

//     void walk(){
//         System.out.println("walk on 4 legs");
//     }
// }

// class Chicken extends Animal{

//     void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }





//constructor:




// public class OOPS{
     
//     public static void main(String args[]){

//         Horse h = new Horse();

//         h.eat();
//         h.walk();

//         Chicken c = new Chicken();

//         c.eat();
//         c.walk();
//         // c.changecolor();

//         // System.out.println(h.color);

//     }
// }

// abstract class Animal{

//     String color;

//     Animal(){
//         color = "brown";
//     }

//     void eat(){
//         System.out.println("eats a lot");
//     }

//     abstract void walk();
// }

// class Horse extends Animal{

//     void changecolor(){

//         color = "red";
//     }

//     void walk(){
//         System.out.println("walk on 4 legs");
//     }
// }

// class Chicken extends Animal{

//     void changecolor(){

//         color = "yellow";
//     }

//     void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }



//calling Constructor:




// public class OOPS{
     
//     public static void main(String args[]){

//         Mustang myhorse = new Mustang();      // creating object

//         //Animal -> Horse -> Mustang     // if we create only objects, construtor 
//                                          // will also get automatically created.

//     }
// }



// abstract class Animal{

//     String color;

//     Animal(){
//         System.out.println("Animal constructor called");
//     }

//     void eat(){
//         System.out.println("eats a lot");
//     }

//     abstract void walk();
// }





// class Horse extends Animal{

//     Horse(){
//         System.out.println("Horse constructor called");
//     }

//     void changecolor(){

//         color = "red";
//     }

//     void walk(){
//         System.out.println("walk on 4 legs");
//     }
// }




// class Mustang extends Horse{

//     Mustang(){
//         System.out.println("Mustang constructor called");
//     }
// }




// class Chicken extends Animal{

//     void changecolor(){

//         color = "yellow";
//     }

//     void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }



//Interfaces :


// public class OOPS{
//     public static void main(String args[]){

//         Queen q = new Queen();

//         q.moves();

        
//     }
// }

// interface ChessPlayer{

//     void moves();

// }



// class Queen implements ChessPlayer{

//     public void moves(){
//         System.out.println("left,right,up,down, diagonal(in all 4 directions");
//     }
// }
// class Rook implements ChessPlayer{

//     public void moves(){
//         System.out.println("left,right,up down");
//     }
// }
// class King implements ChessPlayer{

//     public void moves(){
//         System.out.println("left,right,up,down, diagonal(one step in all 4 directions");
//     }
// }





// implementing multiple inheritence in Interfsces :



// public class OOPS{

//     public static void main(String[] args) {

//         Bear b = new Bear();

//         b.veg();
//         b.nonveg();
        
//     }
// }

// interface Herbivor{

//     void veg();
// }

// interface Carnivore{

//     void nonveg();
// }


// class Bear implements Herbivor, Carnivore{

//     public void veg(){
//         System.out.println("he is vegetarian.");
//     }
//     public void nonveg(){
//         System.out.println("he is non vegetarian.");
//     }
// }



// static keyword:





// public class OOPS{

//     public static void main(String[] args) {

//         Student s1 = new Student();

//         s1.schoolName = "MVM";

//         // System.out.println(s1.schoolName);

//         Student s2 = new Student();
//         // System.out.println(s2.schoolName);

//         Student s3 = new Student();

//         s3.schoolName = "ABC";              // name changed: 

//         System.out.println(s1.schoolName);
//         System.out.println(s3.schoolName);
       

//         System.out.println(s1.percentage(4,5,4));
//         System.out.println(s2.percentage(4,7,4));

        
//     }
// }

// class Student{

//     static float percentage(float a, float b, float c){

//         return ( a+b+c)/3;
//     }

//     String name;
//     int roll;

//     static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }

//     String getName(String name){
//         return this.name; 
//     }
// }






//Super keyword:



// public class OOPS{

//     public static void main(String[] args) {

//         Horse h = new Horse();

//         System.out.println(h.color);
        
//     }
// }

// class Animal{

//     String color;

//     Animal(){
//         System.out.println("Constructor is calleed");
//     }

// }

// class Horse extends Animal{

   
//     Horse(){

//     super.color = "Brown";
//     System.out.println("Constructor is called.");
//     }

// }




//   Practice Questions:





//q-1


// to assign value use dot operator:


// public class OOPS{

//     public static void main(String args[]){

//         Student s = new Student();

//         s.name = "Manan";

//         System.out.println(s.name);
//     }
// }

// class Student {

//     String name;
//     int roll;
// }



//q-2

//output for this:


// public class OOPS{
    
//     public static void main(String[] args){
    
//     Vehicle obj1 = new Car();
    
//     obj1.print1();           // we cant call funtion of car class
    
//     Vehicle obj2= new Vehicle();
    
//     obj2.print();

    
//     }
    
//     class Vehicle{
    
//     void print(){
            
//     System.out.println("Base class (Vehicle)");
    
    
//     }
    
//     }

//     class Car extends Vehicle{
    
//     void print1(){
    
//     System.out.println("Derived class(Car)");
    
//     }
//     }
// }


//ques - 3




// output for this:

// public class OOPS{

//     public static void main(String args[]){

//         System.out.println(Book.count);

//         Book b1 = new Book(150);
//         Book b2 = new Book(250);
//         System.out.println(Book.count);
        
//     }

// }

// class Book{

//     int price;
//      static int count;

//      public Book(int price){

//         this.price = price;
//         count++;
//      }
// }



//no error in this code:



    
//     class OOPS {

    
//     public static void main (String[] args) {
    
//     Test t = new Test();

//     t.set_marks (98);
    
//     System.out.print(Test.marks);    // coz marks is a static type of variable.

//     }
// }

// class Test{

//     static int marks;
    
//     void set_marks(int marks) {
    
//     this.marks=marks;

//     }
    
//     }




//output for this:



    
//     class OOPS {
    

//     public static void main(String args[]) {
    
//     Test t = new Test();
    
    
 
//     t.changeB();

//     System.out.print(Test.a + Test.b);

//     }
    
// }

// class Test {

//     static int a = 10;
    
//     static int b;
    
//     static void changeB() {
    
//     b = a * 3;
    
//     }
    
//     }
