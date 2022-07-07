package com.questionbank.demos;

import java.util.Scanner;

public class QuestionBank {
	
	int quesID;
	String quesDes;
	String ac_yr;
	String Concepts;
	
	public QuestionBank() {
	}
	
	public QuestionBank(int quesID, String quesDes, String ac_yr, String concepts) 
	{
	this.quesID = quesID;
	this.quesDes = quesDes;
	this.ac_yr = ac_yr;
	Concepts = concepts;
	}


	public static void main(String[] args) {
		
		QuestionBank q = new QuestionBank();
		QuestionBank objBank[] = new QuestionBank[10];
		objBank[0] = new QuestionBank(1,"Which orientation of an electric dipole in a uniform electric field would correspond to stable equilibrium ?","2018, 2020","Electric Charges and Fields");
		objBank[1] = new QuestionBank(2,"If the radius of the Gaussian surface enclosing a charge is halved, how does the electric flux through the Gaussian surface change ?","2019, 2021","Gaussian surface");
		objBank[2] = new QuestionBank(3,"Define the term electric dipole moment of a dipole. State its S.I. unit","2016, 2020","Electric dipole");
		objBank[3] = new QuestionBank(4,"In which orientation, a dipole placed in a uniform electric field is in unstable equilibrium ?" ,"2014, 2018,2020","Electric dipole");
		objBank[4] = new QuestionBank(5,"Why should Electrostatic field be zero inside a conductor?","2012, 2019 ","Electrostatic field");
		objBank[5] = new QuestionBank(6,"Why must electrostatic field be normal to the surface at every point of a charged conductor?","2012, 2018, 2021","Electrostatic field");
		objBank[6] = new QuestionBank(7,"A charge ‘q’ is placed at the centre of a cube of side l. What is the electric flux passing through each face of the cube? (All India 2012)","2015, 2020 ","Electric flux");
		objBank[7] = new QuestionBank(8,"Depict the direction of the magnetic field lines due to a circular current carrying loop.","2012, 2022","Magnetic field");
		objBank[8] = new QuestionBank(9,"Why do the electric field lines not form closed loops?","2013, 2015, 2020","Electrostatic field");
		objBank[9] = new QuestionBank(10,"Is the electric field due to a charge configuration with total charge zero, necessarily zero?","2019, 2021 ","Electrostatic field");
		// for all year 
		System.out.println("\n ---------- Display questions year wise --------	");
		
		
		for (int j = 2010; j<2025; j++) 
		{
		String year1 = String.valueOf(j);
		for(int i=0; i<10; i++) 
		{
		if(objBank[i].ac_yr.contains(year1)) 
		{
		System.out.println(year1+" : "+objBank[i].quesDes);
		}
		}
		System.out.println("======================================================");
		}
		// function for retrieve question for particular year which is enter by user
		System.out.println("\n ---------- Retrieve questions for a given year --------");
		System.out.println(" Enter the year : ");
		Scanner sc = new Scanner(System.in);
		String y = sc.next();
		for(int i=0; i<10; i++) 
		{
		if(objBank[i].ac_yr.contains(y)) 
		{
		System.out.println(y+" : "+objBank[i].quesDes);
		}
		}
		System.out.println("======================================================");
		// function for retrieve the concept having maximum question in the question bank
		System.out.println("-------- Questions by particular concept ---------------"); 
		String con[] = new String[6];
		con[0] = "Electrostatic field";
		con[1] = "Electric Charges and Fields";
		con[2] = "Gaussian surface";
		con[3] = "Electric dipole";
		con[4] = "Electric flux";
		con[5] = "Magnetic field";
		
		int count=0;
		int max=0;
		String x="";
			for(int i=0; i<10; i++)
			{
						
				if(objBank[i].Concepts.contains(con[0])) 
				{
					
					System.out.println(con[0].toString()+" : "+objBank[i].quesDes);
					count++;
				}
				
			}
			if(count>max)
			{
				max=count;
				//System.out.println(con[0].toString());
				x=con[0].toString();
				//System.out.println(x);
		
			}
			System.out.println("-----------------------------------------------");
			System.out.println(con[0].toString()+" Count : "+count);
			System.out.println("-----------------------------------------------");
			
			System.out.println("\n");
			
			count=0;
			
			for(int i=0; i<10; i++)
			{
						
				if(objBank[i].Concepts.contains(con[1])) 
				{
					System.out.println(con[1].toString()+" : "+objBank[i].quesDes);
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				//System.out.println(con[0].toString());
				x=con[1].toString();
				//System.out.println(x);
			}
			System.out.println("-----------------------------------------------");
			System.out.println(con[1].toString()+" Count : "+count);
			System.out.println("-----------------------------------------------");
			
			System.out.println("\n");
			
			count=0;
			for(int i=0; i<10; i++)
			{
						
				if(objBank[i].Concepts.contains(con[2])) 
				{
					System.out.println(con[2].toString()+" : "+objBank[i].quesDes);
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				//System.out.println(con[0].toString());
				x=con[2].toString();
				//System.out.println(x);
			}
			System.out.println("-----------------------------------------------");
			System.out.println(con[2].toString()+" Count : "+count);
			System.out.println("-----------------------------------------------");
			
			System.out.println("\n");
			
			count=0;
			for(int i=0; i<10; i++)
			{
						
				if(objBank[i].Concepts.contains(con[3])) 
				{
					System.out.println(con[3].toString()+" : "+objBank[i].quesDes);
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				//System.out.println(con[0].toString());
				x=con[3].toString();
				//System.out.println(x);
			}
			System.out.println("-----------------------------------------------");
			System.out.println(con[3].toString()+" Count : "+count);
			System.out.println("-----------------------------------------------");
			
			
			System.out.println("\n");
			
			count=0;
			for(int i=0; i<10; i++)
			{
						
				if(objBank[i].Concepts.contains(con[4])) 
				{
					System.out.println(con[4].toString()+" : "+objBank[i].quesDes);
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				//System.out.println(con[0].toString());
				x=con[4].toString();
				//System.out.println(x);
			}
			System.out.println("-----------------------------------------------");
			System.out.println(con[4].toString()+" Count : "+count);
			System.out.println("-----------------------------------------------");
			
			
			System.out.println("\n");
			
			count=0;
			for(int i=0; i<10; i++)
			{
						
				if(objBank[i].Concepts.contains(con[5])) 
				{
					System.out.println(con[5].toString()+" : "+objBank[i].quesDes);
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				//System.out.println(con[0].toString());
				x=con[5].toString();
				//System.out.println(x);
				
			}
			System.out.println("-----------------------------------------------");
			System.out.println(con[5].toString()+" Count : "+count);
			System.out.println("-----------------------------------------------");
			
			
		//System.out.println("Max questions : "+max + " Concept : "+ x.toString());
		
		//maximum questions calculate on basis of concepts
		System.out.println("\n\n ************************************************************");
		System.out.println(" Maximum questions calculate on the basis on concepts :\n");
		System.out.println("************************************************************");
		
		for(int i=0; i<10;i++)
		{
			if(objBank[i].Concepts.contains(x))
			{
				
				System.out.println(con[0].toString()+" : "+objBank[i].quesDes);
				
			}
		}


	}

}
