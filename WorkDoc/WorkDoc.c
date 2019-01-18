#include "stdio.h"
extern int x; //Extern variable
int z=10; //Global Variable
typedef long long int LL; //Typedef Varaible
void calSquare(int); //ProtoTyping  of a Function
int main(void) {
    const int a = 32; //Const Variable
    char b = 'G';
    extern int z;
    LL c = 1000000;
    int x = 15;
    printf("Hello World\n");
    printf("Value of Constant Variable:%d\n",a);
    printf("Value of Character Varaible:%c\n",b);
    printf("Value of TypeDef Variable:%lld\n",c);
    printf("Value of Extern Variables X and Z:%d and %d\n",x,z);

    return 0;
}
void calSquare(int arg) {
    printf("The Square of %d is %d\n",arg, arg*arg);
}