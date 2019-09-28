#include <stdio.h>


int main()
{
		
	int i , times , back = 0 , middle = 1 , front;
	
	scanf( "%d" , &times );

	if( times > 1 )
	{
		for( i=1; i<times; i++ )
		{
			front = middle + back;				/*Fibonacci using loop*/
			back = middle;
			middle = front;
		}
		printf("%d\n",front);					//print the result
	}
	else
			printf("i must bigger than 1\n");
	
	front = front * 5;
	return 0;
}
