//Time (hour min sec)
#include<stdio.h>
typedef struct Time {
	int hour;
	int min;
	int sec;

} time;
void storetime(time* );
time Formattime(time );
void display(time );
void main() {

	time t;

	storetime(&t);
	time res= Formattime(t);
	display(res);

}
void storetime(time* t) {

	printf("-----Store HOUR MIN SEC --------\n");
	printf("Enter Hour:");
	scanf("%d",&t->hour);
	printf("Enter Min:");
	scanf("%d",&t->min);
	printf("Enter Seconds:");
	scanf("%d",&t->sec);
}//store ends here
time Formattime(time t) {

	int totalsec=(t.hour*3600)+(t.min*60)+t.sec;

	t.hour=totalsec/3600;
	t.min=(totalsec%3600)/60;
	t.sec=(totalsec%3600)%60;
	return t;
}//format ends here

void display(time t) {
	printf("------Time------\n");
	printf(" %d : %d : %d",t.hour,t.min,t.sec);
}