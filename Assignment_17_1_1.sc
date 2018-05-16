object Assignment_17_1 {
  //Task 1 : Example of Simple Inheritance

  //This is super class
  class Employee(){
    def Name:String="Prachi"
    def DOB:String = "10-06-1985"
    def Salary:Float=40000
  }
  //This is sub class getting inherited from super class
  class Programmer (bn:Float,PL:String) extends Employee
  {
    def Bonus:Float=bn
    def Programming_Lang:String=PL
  }

  //Create objects
  //Create employee class object and print its fields (any)
  val empObj = new Employee()
  println("from super class  "+ empObj.Name)
  println("from super class "+ empObj.Salary)

  val objProgrammer = new Programmer(5000,"C#")
  println("from inherited object "+ objProgrammer.Name)
  println("from inherited object "+  objProgrammer.Salary)
  println("from inherited object "+ objProgrammer.Bonus)
  println("from inherited object "+ objProgrammer.Programming_Lang)

  //first trait
    trait Birds
    {
      def sound:String="Flying"
      def Work()= {"Flying, Flying"}
    }
    //Second trait
    trait Animal
    {
      def Type:String="Pet"
      def IsBird(): String={
      if(Type=="Pet") "Bird" else "Animal"
      }
    }
  //created a class which is extending the both the traits
  class Mammal extends Birds with Animal
  {
    //Here we have overridden the type from Animal Class
    override def Type: String = "Dog"
  }

  val objMammal = new Mammal()
  //Below function will call where Type = "Dog"
  val result =objMammal.IsBird()
  val result1 = objMammal.Work()

  println(result)
  println(result1)


  //Task 3 : create a partial function to add three numbers where one is constant and two are passed as input

  val addition : PartialFunction[(Int,Int),Int] = {
    case (a,b) => 5 + a + b
  }

  def squareOfNumber(x:Int):Int={

    val square = x * x
    return square
  }

  val result3 = squareOfNumber(addition(1,2))
  println(result3)

  //Task 4

}