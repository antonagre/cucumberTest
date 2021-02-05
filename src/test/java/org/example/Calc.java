package org.example;

public class Calc {
private int result;

public void reset() {
result = 0;
}
public void add(int x){
result+=x;
}

public void sub(int x){
    if(result==0) result=x;
    else result-=x;
}

public void mul(int x){
if(result==0) result=x;
else result*=x;
}

public void div(int x){
if(result==0) result=x;
else result/=x;
}

public int getResult(){ return  result;}
}
