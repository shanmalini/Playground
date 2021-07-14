#include<iostream>
using namespace std;

class Test {
    int num;
public:

    void input() {
       
        cin>>num;
    }

    void check() {
        if (num % 2 == 0) {
            cout << "EVEN";
        } else {
            cout << "ODD";
        }
    }
};

int main() {

    Test tt;

    tt.input();
    tt.check();

    return 0;
}