#include <iostream>
using namespace std ;

class marks {

public :

int x ;

marks (int x ){
this->x= x ;
}

void show (){
cout<<"value"<<this->x<<endl;
}

};


int main (){

marks *sourav = new marks(10);
cout<<sourav->x<<endl;
cout<<"Address before deleting "<<&sourav<<endl;
cout<<"Printing via dereference "<<(*sourav).x<<endl;

//delete sourav;
sourav =nullptr;
cout<<"Address after deleting "<<&sourav<<endl;

cout<<"after deleting "<<sourav->x<<endl;






}
