void main(){
    int num;
    float s;
    printf("Please Enter a Integer type number:");
    scanf("%d", &num);

    if(num>10){
        s = 3 * (num + 3.14);
    }
    else {
        s = num * (num - 3.14);
    }
    printf("The result is %f\n", s);
}
