#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct address {
	char city[30];
	int pin;

};
typedef struct Player {
	int jercyNo;
	char name[25];
	int run;
	int wickets;
	int matchplayed;
	struct address ad;
} Player;
void AddPlayers(Player Players[],int* );
void Displayplayers(Player players[],int  );
void searchPlayer(Player players[],int  );
void UpdateplayerData(Player players[],int  );
void displayTopPlayers(Player players[],int );
void RemovePlayer(Player players[],int* );
void main() {

	printf("Enter Maximum palyers You Want Manage:");
	int newsize;
	scanf("%d",&newsize);
	int size=5;
	size=size+newsize;
	printf("\nThe Previous 5 hardcoded players are stored in the database, Now you can Manage %d more Players\n ",newsize);

	Player* players= (Player*)malloc(size * sizeof(Player));

	int choice;
	int count=0;
//  Hardcode 5 players at the start
	players[0] = (Player) {
		7, "MS Dhoni",10500,256,350,{"Ranchi",834001}
	};
	players[1] = (Player) {
		18,"Virat Kohli",13000,5,280,{"Delhi",110001}
	};
	players[2] = (Player) {
		45, "Rohit Sharma",9800,10,240,{"Mumbai",400001}
	};
	players[3] = (Player) {
		17, "K Rahul",6700,57,485,{"Pune",411038}
	};
	players[4] = (Player) {
		36, "Yogesh patil",8755,35,452, {"Pune",411040}
	};
	count = 5;   // already 5 players added

	while (1) {
		printf("\n===== Players Management System =====\n");
		printf("1. Add Player\n");
		printf("2. Display Players\n");
		printf("3. Search Player\n");
		printf("4. Update Player data\n");
		printf("5. Display Sorted Players\n");
		printf("6. Remove Player\n");
		printf("7. Exit\n");
		printf("Enter your choice: ");
		scanf("%d", &choice);

		switch(choice) {
			case 1:
				if(count==size) {
					printf("Player list is full...........\n");
					printf("Do you want continue for Add new players Data. \nIf Yes Press: 1\n   No Press: 2\n-->");
			         int n;
			         scanf("%d",&n);
			         if(n==1){
					 
					int nsize;
					printf("Enter New Size Of your Player list:");
					scanf("%d",&nsize);
					size=size+nsize;
					players=(Player*)realloc(players,size*sizeof(Player));
					printf("\nYour players list size is updated by %d\n",nsize);
					}
				} else {
					AddPlayers(players,&count);
				}
			
				
				
				break;

			case 2:
				Displayplayers(players,count);
				break;

			case 3:
				searchPlayer(players,count);
				break;

			case 4:
				UpdateplayerData(players,count);
				break;

			case 5:
				displayTopPlayers(players,count);
				break;

			case 6:
				RemovePlayer(players,&count);
				break;

			case 7:
				printf("Exiting program......\n");
				free(players);   //Memory release before exit;
				exit(0);

			default:
				printf("Invalid Choice!\n");
		}
	}
}
//main ends here

void AddPlayers(Player players[],int* count) {
	printf("Enter Jercy number: ");
	scanf("%d",&players[*count].jercyNo);
	printf("Enter Player name: ");
	scanf(" %[^\n]",players[*count].name);
	printf("Enter Runs: ");
	scanf("%d",&players[*count].run);
	printf("Enter Wickets: ");
	scanf("%d",&players[*count].wickets);
	printf("Enter Matches Played: ");
	scanf("%d",&players[*count].matchplayed);
	printf("Enter Player Address (City) : ");
	scanf(" %[^\n]",players[*count].ad.city);
	printf("Enter Player Address (Pin) : ");
	scanf("%d",&players[*count].ad.pin);


	(*count)++;
	printf("Player added successfully!\n");
}// AddPlayers ends here


void Displayplayers(Player players[],int count) {
	if(count==0) {
		printf("No Players to Display!\n");
		return;
	}
	printf("\n=============Player Record=============\n\n");
	for(int i=0; i<count; i++) {
		printf("\nDetails of Player %d",i+1);
		printf("\n-------------------------------------------------------------------------------------\n");
		printf("Jercy NO=%d \nPlayer Name=%s \nRuns=%d \nWickets=%d \nMatches Played=%d \nAddress=%s - %d\n",players[i].jercyNo,players[i].name,players[i].run,players[i].wickets,players[i].matchplayed,players[i].ad.city,players[i].ad.pin);
		printf("-------------------------------------------------------------------------------------\n");
	}
}// display player end here

void searchPlayer(Player players[],int count) {
	if(count==0) {
		printf("No Players to search\n");
		return;
	}
	int choice;
	printf("1.Search Playes by Jercy No:\n");
	printf("2.Search Player by Name: \n");
	printf("Enter Choice:");
	scanf("%d",&choice);
	int jNo;
	char Name[25];
	int flag=0;
	if(choice==1) {
label:
		printf("\nEnter Player Jercy No You Want to Search\n");
		scanf("%d",&jNo);


		for( int i=0; i<count; i++) {
			if(players[i].jercyNo==jNo) {
				flag=1;
				printf("-------------------------------------------------------------------------------------\n");
				printf("Jercy NO=%d \nPlayer Name=%s \nRuns=%d \nWickets=%d \nMatches Played=%d \n",players[i].jercyNo,players[i].name,players[i].run,players[i].wickets,players[i].matchplayed);
				printf("-------------------------------------------------------------------------------------\n");
				break;
			}
		}
		if(!flag) {
			printf("%d Jercy Number Player Not Found \n",jNo);
			goto label;
		}

	} else {
start:
		printf("\nEnter Player Name You Want to Seach\n");

		scanf(" %[^\n]",Name);


		for(int j=0; j<count; j++) {
			if(strcasecmp(players[j].name,Name)==0) {
				printf("%s is found At %d Index \n",players[j].name,j);
				flag=1;
				printf("-------------------------------------------------------------------------------------\n");
				printf("Jercy NO=%d \nPlayer Name=%s \nRuns=%d \nWickets=%d \nMatches Played=%d \n",players[j].jercyNo,players[j].name,players[j].run,players[j].wickets,players[j].matchplayed);
				printf("-------------------------------------------------------------------------------------\n");
				break;
			}
		}
		if(!flag) {
			printf("%s Is Not Found!",Name);
			goto start;
		}
	}

}

//Search ends here;

void UpdateplayerData(Player players[], int count) {
    if (count == 0) {
        printf("No Players available to Update\n");
        return;   
    }

    int jNo, flag = 0;

    while (1) {  
        printf("Enter jersey No of the player You want to Update (Enter 0 to Exit):\n");
        scanf("%d", &jNo);

        if (jNo == 0) {   
            printf("Exiting update function...\n");
            return;
        }

        flag = 0; 

        for (int i = 0; i < count; i++) {
            if (players[i].jercyNo == jNo) {
                flag = 1;
                printf("%d found At %d index\n\n", players[i].jercyNo, i);

                printf("Enter what you want to update:\n");
                printf("1. Runs\n2. Wickets\n3. Matches Played\n");

                int choice;
                scanf("%d", &choice);

                switch (choice) {
                    case 1:
                        printf("Enter Updated Runs: ");
                        scanf("%d", &players[i].run);
                        break;
                    case 2:
                        printf("Enter Updated Wickets: ");
                        scanf("%d", &players[i].wickets);
                        break;
                    case 3:
                        printf("Enter Updated Matches: ");
                        scanf("%d", &players[i].matchplayed);
                        break;
                   
                    default:
                        printf("Invalid Choice!\n");
                        return;  
                }

                printf("-----------------------------------------------------------------------------------\n");
                printf("Player updated successfully!\n");
                break;
                
            }
        }

        if (!flag) {
            printf("%d Jersey Number Player Not Found. Please try again!\n", jNo);
        }
    }
}

			

// Function to display Top 3 Players by Min/Max Runs & Wickets
void displayTopPlayers(struct Player players[], int count) {
	if (count==0) {
		printf("\nNo players in the system.\n");


	}

	struct Player temp[count];


	//Max Runs
	//copy data players into temp
	for (int i=0; i<count; i++) {

		temp[i]=players[i];
	}

	int choice;
	printf("1. Top 3 players by Max runs.\n2. Top 3 Players by Min runs.\n3. Top 3 players by Max wickets.\n4. Top 3 players by Min Wickets.");
	printf("\nEnter Choice what do want to search:->");
	scanf("%d",&choice);
	switch(choice) {

		case 1:
			for (int i = 0; i < count - 1; i++) {
				for (int j = 0; j < count - i - 1; j++) {
					if (temp[j].run < temp[j + 1].run) {
						struct Player t = temp[j];
						temp[j] = temp[j + 1];
						temp[j + 1] = t;
					}
				}
			}
			printf("\nTop 3 Players by Max Runs:\n");
			for (int i = 0; i<count && i<3; i++) {
				printf("Player Name: %s   | Runs: %d \n\n", temp[i].name, temp[i].run);
			}
			break;

		case 2://min runs
			for (int i = 0; i < count - 1; i++) {
				for (int j = 0; j < count - i - 1; j++) {
					if (temp[j].run > temp[j + 1].run) {
						struct Player t = temp[j];
						temp[j] = temp[j + 1];
						temp[j + 1] = t;
					}
				}
			}
			printf("\nTop 3 Players by Min Runs:\n");
			for (int i = 0; i<count && i<3; i++) {
				printf("Player Name: %s   | Runs: %d \n\n", temp[i].name, temp[i].run);
			}
			break;



		case 3:
			//max wickets
			for (int i = 0; i < count - 1; i++) {
				for (int j = 0; j < count - i - 1; j++) {
					if (temp[j].wickets < temp[j + 1].wickets) {
						struct Player t = temp[j];
						temp[j] = temp[j + 1];
						temp[j + 1] = t;
					}
				}
			}
			printf("\nTop 3 Players by Max Wickets:\n");
			for (int i = 0; i < count && i < 3; i++) {
				printf("Player Name: %s  | Wickets: %d  \n\n", temp[i].name, temp[i].wickets);
			}
			break;
		case 4:

			// Min Wickets

			for (int i = 0; i < count - 1; i++) {
				for (int j = 0; j < count - i - 1; j++) {
					if (temp[j].wickets > temp[j + 1].wickets) {
						struct Player t = temp[j];
						temp[j] = temp[j + 1];
						temp[j + 1] = t;
					}
				}
			}
			printf("\nTop 3 Players by Min Wickets:\n");
			for (int i = 0; i < count && i < 3; i++) {
				printf("Player Name: %s  | Wickets: %d  \n\n", temp[i].name, temp[i].wickets);
			}
			break;
		default:
			printf("\nInvalid Choice!..");
	}
}//  sort ends here

void RemovePlayer(Player players[],int* count) {
	if(*count==0) {
		printf("Players Not Awailable!\n");
		return;
	}

	printf("Enter the Player Jersey Number You Want to remove\n");
	int jno;
	scanf("%d",&jno);
	int index=-1;
	int flag=0;
	for(int i=0; i<*count; i++) {
		if(players[i].jercyNo==jno) {
			index=i;
			flag=1;
		}
	}
	if(!flag) {
		printf("Player Not Found\n");
		return;
	}


	for(int i=index; i<*count-1; i++) {
		players[i]=players[i+1];
	}
	(*count)--;
	printf("Player Remove Successfully!\n");

}






