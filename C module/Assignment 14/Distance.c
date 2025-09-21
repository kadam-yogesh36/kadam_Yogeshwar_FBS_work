//distance (feet ,inch)
#include<stdio.h>
typedef struct Distance{
	int feet;
	int inch;
	
}distance;
void storedistance( distance* );
distance formatdistance(distance );
void display(distance );
void main(){
	
	distance d;
	
	storedistance(&d);
distance res=formatdistance(d);
	display(res);
		
}//main ends here

void storedistance( distance* d){
	printf("Enter feeet & inch\n");
	
	printf("Enter feet:");
	scanf("%d",&d->feet);
	printf("Enter inch:");
	scanf("%d",&d->inch);
	
}//storedistance  

distance formatdistance(distance d){
	int totalinch=(12 * d.feet)+d.inch;
	
	d.feet=totalinch/12;
	d.inch=totalinch%12;
	return d;
	
	
}//ends here


void display(distance d){
	printf("Formatted Distance\n");
	printf("%d feet %d inch",d.feet,d.inch);
}

