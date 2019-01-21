#include <stdio.h>
enum day {sunday = 1, monday, tuesday, wednesday, thursday, friday, saturday};
int main (void) {
    enum day d = thursday;
    printf("%d",d);    
}
