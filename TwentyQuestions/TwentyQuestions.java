import java.util.Scanner;

public class TwentyQuestions
{

  public static void main( String[] args )
  {

    Scanner keyboard = new Scanner(System.in);

    String ans1, ans2;

    System.out.println( "TWO QUESTIONS!" );
    System.out.println( "Think of an object, and I'll try to guess it." );

    System.out.println( "Question 1) Is it animal, vegetable or mineral?" );
    System.out.print( ">" );
    ans1 = keyboard.next();

    System.out.println( "Question 2) Is it bigger than a breadbox?" );
    System.out.print( ">" );
    ans2 = keyboard.next();

    if ( ans1.equals("animal") )
    {
      if ( ans2.equals("yes") )
      {
        System.out.println( "My guess is that you are thinking of a moose." );
      }

      else
      {
        System.out.println( "My guess is that you are thinking of a squirrel." );
      }
    }


    if ( ans1.equals("vegetable") )
    {
      if ( ans2.equals("yes") )
      {
        System.out.println( "My guess is that you are thinking of a watermelon." );
      }

      else
      {
        System.out.println( "My guess is that you are thinking of a carrot." );
      }
    }

    if ( ans1.equals("mineral") )
    {
      if ( ans2.equals("yes") )
      {
        System.out.println( "My guess is that you are thinking of a camaro." );
      }

      else
      {
        System.out.println( "My guess is that you are thinking of a paper-clip." );
      }
    }

    
    System.out.println( "I would ask you if I'm right, but I really dont care." );



  }
}