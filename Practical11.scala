object HelloWorld {
	def main(args: Array[String]): Unit = {

	    // program : 1
	      var message : String = "Hey good morning.";
	      println("Value of message is : " + message);
	 

	    // program : 2
	      var number : Int = (-100);
	    
	    if(number > 0)
	        println("Number is positive");
	    else if(number < 0)
	        println("Number is negative");
	    else  
	        println("Number is zero");
	    
	   
	    // program : 3
	      var a : Int = (100);
	      var b : Int = (150);
	 
	      if(a > b)
	        println("value of " + a + " is greater than " + b);
	      else 
	        println("value of "+ b + " is greater than " + a);
	 
	    
	    // program : 4
  	   def factorial(n : Int) : Int = {
  	     var fact : Int = (1);
  	     for(i <- 1 to n)
  	          fact = fact * i;
  	     return fact;
  	   }
  	   
  	   val factorialResult = factorial(5);
  	   println("factorial of 5 is " + factorialResult);
  	
  	
  	 // program : 5
  	    
	   def isPrime(n : Int) : Int = {
	     for(i <- 2 to (n - 1))
	     {
	       if(i != n)
	       {
	         if(n % i == 0)
	            return 0;
	       }
	     }
	     return 1;
	   }
	 
	 
	  var isPrimeResult = isPrime(15);
	  if(isPrimeResult == 1)
	      println("Number is Prime")
	  else
	      println("Number is not Prime");
	
			

	}
}

 code 2  --- ----- --- -- -- - -- - - - --
object HelloWorld{
  def main(args: Array[String]) : Unit = {
    
    println("1.Add")
    println("2.Sub")
    println("3.Multiply")
    println("4.Division")
    
    var ch : Int = scala.io.StdIn.readLine().toInt
    
    println("Enter first number")
    var num1 : Int = scala.io.StdIn.readLine().toInt
    println("Enter second number")
    var num2 : Int = scala.io.StdIn.readLine().toInt
    
    if(ch == 1)
    {
      add(num1, num2)
    }
    else if(ch == 2)
    {
      sub(num1, num2)
    }
    else if(ch == 3)
    {
      mul(num1, num2)
    }
    else if(ch == 4)
    {
      div(num1, num2)
    }
    else
    {
      println("invalid")
    }
    
    def add(num1: Int, num2:Int) = {
      println(num1 +  num2)
    }
  
    def sub(num1: Int, num2:Int) = {
      println(num1 -  num2)
    }
    
    def mul(num1: Int, num2:Int) = {
      println(num1 *  num2)
    }
    
    def div(num1: Int, num2:Int) = {
      println(num1 / num2)
    }
}
}