#include <stdio.h>
#include <string.h>

#define SIZE 10   


struct Player {
    char name[50];
    int matches;
    int runs;
    int wickets;
};


void acceptPlayers(struct Player players[], int n) {
    for (int i = 0; i < n; i++) {
        printf("\nEnter details of Player %d\n", i + 1);

        printf("Name: ");
        scanf(" %[^\n]", players[i].name);   

        printf("Matches Played: ");
        scanf("%d", &players[i].matches);

        printf("Runs: ");
        scanf("%d", &players[i].runs);

        printf("Wickets: ");
        scanf("%d", &players[i].wickets);
    }
}


void displayPlayers(struct Player players[], int n) {
    printf("\n--- Player Information ---\n");
    for (int i = 0; i < n; i++) {
        printf("\nPlayer %d\n", i + 1);
        printf("Name    : %s\n", players[i].name);
        printf("Matches : %d\n", players[i].matches);
        printf("Runs    : %d\n", players[i].runs);
        printf("Wickets : %d\n", players[i].wickets);
    }
}


void findMax(struct Player players[], int n) {
    int maxRunIndex = 0, maxWicketIndex = 0;

    for (int i = 1; i < n; i++) {
        if (players[i].runs > players[maxRunIndex].runs) {
            maxRunIndex = i;
        }
        if (players[i].wickets > players[maxWicketIndex].wickets) {
            maxWicketIndex = i;
        }
    }

    printf("\n--- Player with Maximum Runs ---\n");
    printf("Name: %s\nRuns: %d\n", players[maxRunIndex].name, players[maxRunIndex].runs);

    printf("\n--- Player with Maximum Wickets ---\n");
    printf("Name: %s\nWickets: %d\n", players[maxWicketIndex].name, players[maxWicketIndex].wickets);
}

void main() {
    struct Player players[SIZE];

    
    acceptPlayers(players, SIZE);

    
    displayPlayers(players, SIZE);

   
    findMax(players, SIZE);

  
}
