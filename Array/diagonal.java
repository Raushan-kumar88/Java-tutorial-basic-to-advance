
class diagonal{

	
	static void Diagonal(int[][] matrix, int N)
	{
		
		int Pd = 0, Sd = 0;

		
		for (int k = 0; k < N; k++) {

			
			for (int l = 0; l < N; l++) {

				
				if (k == l)
					Pd += matrix[k][l];

				
				if ((k + l) == (N - 1))
					Sd += matrix[k][l];
			}
		}

		
		System.out.println("Sum of  Diagonal:"
						+ Pd);
	
		
	}


	
	static public void main(String[] args)
	{

		
		int[][] b = { { 8, 2, 13, 4 },
					{ 9, 16, 17, 8 },
					{ 1, 22, 3, 14 },
					{ 15, 6, 17, 8 } };

                    Diagonal(b, 4);
	
	}
}

