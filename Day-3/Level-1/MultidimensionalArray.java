import java.util.Scanner;

class MultidimensionalArray{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows"); // taking rows from user 
		int rows = input.nextInt(); 
		
		System.out.println("Enter number of columns"); // taking columns from user
		int columns = input.nextInt();
		
		// create 2D-array
		int [][] multiArray = new int [rows][columns];
		
		// loops for assigning data to 2D-array
		for(int i = 0; i<rows ; i++){
			for(int j = 0; j<columns; j++){
				System.out.println("Enter data for index ["+i+"]["+j+"]");
				multiArray[i][j] = input.nextInt();
			}
		}
		
		// create 1D-array
		int [] array = new int [rows * columns];
		int index = 0;
		
		
		// copy 2D-array to 1D-array
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				array[index++] = multiArray[i][j];
			}
		}
		
		System.out.println("The elements of the 1D array are:");
        for (int element : array) {
            System.out.print(element + " ");
        }
		
		// close Scanner object
		input.close();
	}
	
}