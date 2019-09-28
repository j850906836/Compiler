void main(){
    float num;
    float s;
    printf("Please Enter a float type number:");
    scanf("%f", &num);

    if(num>10){
        s = 3 * (num + 3.14);
    }
    else {
        s = num * (num - 3.14);
    }
    printf("The result is %f\n", s);
}
