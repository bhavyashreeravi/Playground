#include <stdio.h>
int main(){
  	int n;
  scanf("%d",&n);
  for(int row=1;row<=n;row++)
  {
    for(int col=1;col<=row;col++)
    {
      printf("%d",row);
    }
    printf("\n");
  }
	return 0;
}