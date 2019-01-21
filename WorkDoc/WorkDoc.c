#include <stdio.h>
struct geeksforgeeks {
    char name[10];
    char street[30];
    char city[50];
    int pin;
};
int main(void) {
    struct geeksforgeeks Hello;
    Hello = {"Geeks","For","City",25};
    printf("%d",Hello.pin);
    return 0;
}