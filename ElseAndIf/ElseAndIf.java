public class ElseAndIf
{
  public static void main( String[] args )
  {
    int people = 30;
    int cars = 40
    int buses = 15;

    if ( cars > people )
    {
      System.out.println( "We should take the cars." );
    }

    else if ( cars < people )
    {
      System.out.println( "We should not take the cars." ); 
    }

    else
    {
      System.out.println( "We can't decide." );
    }
    
  }
}