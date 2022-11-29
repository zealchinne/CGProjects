package com.jojuskills;

public class MovieArray {
	//main method
		public static void main(String ...args)
		{
			Theatre movies[] = new Theatre[5]; // creates an array of movies
			//creating objects
			movies[0]= new Theatre("Avatar2","3pm,6pm",750);
			movies[1]= new Theatre("Kanthara","10am,5pm",275);
			movies[2]= new Theatre("KGF2","11pm,9pm",600);
			movies[3]= new Theatre("God Father","2pm,10pm",200);
			movies[4]= new Theatre("Harry Potter","5pm,8pm",475);
			
			// displaying all the movies in the theatre
			for(int i=0; i<movies.length;i++)
			{
				movies[i].displayMovie();
			}
						
			System.out.println("------------setter injected object---loosely coupled--------better approach------");
			
			Theatre t1=new Theatre();
						
			t1.setMovieName("Harry Potter");
			t1.setMovieTime("forever");
			t1.setTicketPrice(120.89);
			t1.displayMovie();
						
			System.out.println("--------------constructor injected object------tightly coupled---------");
			
			Theatre t2 = new Theatre("Avatar2","3pm,6pm",500);
			
			t2.displayMovie();
			
		}
		
	}