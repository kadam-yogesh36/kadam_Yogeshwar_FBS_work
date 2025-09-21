#include <stdio.h>
#include <string.h>

#define MAX_MOVIES 50


struct Movie {
    char title[100];
    char director[100];
    int releaseYear;
    char genre[50];
};

// Function to add a new movie
void addMovie(struct Movie movies[], int *count) {
    if (*count >= MAX_MOVIES) {
        printf("Database is full! Cannot add more movies.\n");
        return;
    }

    printf("\nEnter Movie Title: ");
    scanf(" %[^\n]", movies[*count].title);

    printf("Enter Director: ");
    scanf(" %[^\n]", movies[*count].director);

    printf("Enter Release Year: ");
    scanf("%d", &movies[*count].releaseYear);

    printf("Enter Genre: ");
    scanf(" %[^\n]", movies[*count].genre);

    (*count)++;
    printf("Movie added successfully!\n");
}

// Function to display all movies
void displayMovies(struct Movie movies[], int count) {
    if (count == 0) {
        printf("\nNo movies in database.\n");
        return;
    }

    printf("\n--- Movie Database ---\n");
    for (int i = 0; i < count; i++) {
        printf("\nMovie %d\n", i + 1);
        printf("Title   : %s\n", movies[i].title);
        printf("Director: %s\n", movies[i].director);
        printf("Year    : %d\n", movies[i].releaseYear);
        printf("Genre   : %s\n", movies[i].genre);
    }
}

// Function to search movie by title
void searchMovie(struct Movie movies[], int count) {
    char searchTitle[100];
    int found = 0;

    printf("\nEnter movie title to search: ");
    scanf(" %[^\n]", searchTitle);

    for (int i = 0; i < count; i++) {
        if (strcasecmp(movies[i].title, searchTitle) == 0) {
            printf("\nMovie Found!\n");
            printf("Title   : %s\n", movies[i].title);
            printf("Director: %s\n", movies[i].director);
            printf("Year    : %d\n", movies[i].releaseYear);
            printf("Genre   : %s\n", movies[i].genre);
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Movie not found in database.\n");
    }
}

// Function to update movie by title
void updateMovie(struct Movie movies[], int count) {
    char updateTitle[100];
    int found = 0;

    printf("\nEnter movie title to update: ");
    scanf(" %[^\n]", updateTitle);

    for (int i = 0; i < count; i++) {
        if (strcasecmp(movies[i].title, updateTitle) == 0) {
            printf("\nMovie Found! Enter new details:\n");

            printf("New Title: ");
            scanf(" %[^\n]", movies[i].title);

            printf("New Director: ");
            scanf(" %[^\n]", movies[i].director);

            printf("New Release Year: ");
            scanf("%d", &movies[i].releaseYear);

            printf("New Genre: ");
            scanf(" %[^\n]", movies[i].genre);

            printf("Movie updated successfully!\n");
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Movie not found in database.\n");
    }
}

void main() {
    struct Movie movies[MAX_MOVIES];
    int count = 0;
    int choice;

    while (1) {
        printf("\n=== Movie Database Menu ===\n");
        printf("1. Add Movie\n");
        printf("2. Display All Movies\n");
        printf("3. Search Movie by Title\n");
        printf("4. Update Movie by Title\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: addMovie(movies, &count); break;
            case 2: displayMovies(movies, count); break;
            case 3: searchMovie(movies, count); break;
            case 4: updateMovie(movies, count); break;
            case 5: printf("Exiting program. Goodbye!\n");
            default: printf("Invalid choice! Try again.\n");
        }
    }
}
