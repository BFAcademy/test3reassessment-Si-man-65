
class Main {
  public static void main(String[] args) {

    System.out.println(triangleType(3, 4, 0));
  }

  /*Exercise 1 */
  public static boolean isEven (int x) 
  {

    if(x % 2 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  
  }


  /* Exercise 2 */
  public static String triangleType(int a, int b, int c) 
  {
	   
      if(a == b && b == c && a == c)
      {
        return "Equilateral";
      }
      else
      {
        if(a == b || b == c || a == c)
        {
          return "Isosceles";
        }
        else
        {
          return "Triangle";
        }
      }
  
      
  }


  /* Exercise 3 */
  public static String classifyNumber(int num) // :)
  {
     if(num > 0)
     {
        if(num % 2 == 0)
        {
          return "Positive even";
        }
        else
        {
          return "Positive odd";
        }
     }
     else if(num == 0)
     {
        return "Zero";
     }
     else
     {
        if(num % 2 == 0)
        {
          return "Negative even";
        }
        else
        {
          return "Negative odd";
        }
     }
  }


  /* Exercise 4 */
  public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
  {

    //Need to clean up, very complicated

    Boolean checkYear;
    Boolean checkMonth;
    Boolean checkDay;
    if(year1 > year2)
    {
      return true;
    }
    else{
      if(year1 >= year2)
      {
        checkYear = true;
      }
      else
      {
        checkYear = false;
      }
      if(month1 >= month2)
      {
        checkYear = true;
        
      }
      else
      {

      }
      if(day1 > day2)
      {
        checkDay = true;
      }
      else
      {
        checkDay = false;
      }
    }
  } 


  

}
