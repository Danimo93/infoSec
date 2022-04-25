#include <stdio.h>

void main (int argc, char **argv){
/* for debug
  int i;
  for (i = 1; i < argc; i++){
    printf("%s ",argv[i]);
  }
  printf("\n");
*/

if (argc != 5){
  printf("Invalid number of parameters!!\n\n");
}
else{

  printf ("This is the fakemail system, this email will NOT be delivered\n");
  printf ("and is intended for testing purposes ONLY!\n\n");
  printf ("The email that would have been sent is...\n\n");

  // order of params are sentfrom sentto subject message"

  printf ("Sent From: %s\n", argv[1]);
  printf ("Sent To: %s\n", argv[2]);
  printf ("Subject: %s\n", argv[3]);
  printf ("Message: %s\n", argv[4]);

}

}
