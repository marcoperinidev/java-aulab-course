 ```                                          
  ______           ___             __        
 /\  _  \         /\_ \           /\ \       
 \ \ \L\ \  __  __\//\ \      __  \ \ \____  
  \ \  __ \/\ \/\ \ \ \ \   /'__`\ \ \ '__`\ 
   \ \ \/\ \ \ \_\ \ \_\ \_/\ \L\.\_\ \ \L\ \
    \ \_\ \_\ \____/ /\____\ \__/.\_\\ \_,__/
     \/_/\/_/\/___/  \/____/\/__/\/_/ \/___/ 
                                            
                                            
  _____                                
 /\___ \                               
 \/__/\ \     __     __  __     __     
    _\ \ \  /'__`\  /\ \/\ \  /'__`\   
   /\ \_\ \/\ \L\.\_\ \ \_/ |/\ \L\.\_ 
   \ \____/\ \__/.\_\\ \___/ \ \__/.\_\
    \/___/  \/__/\/_/ \/__/   \/__/\/_/
                                      
 ```
 
 ![ezgif com-video-to-gif](https://user-images.githubusercontent.com/107396314/234327312-948b5e0f-779f-49c9-b09c-bb4e7b9d5399.gif)

 
##
# Used Vaadin
 
Use this to create a new project https://vaadin.com/download/
 
## In order to use this:
 
```
git clone https://github.com/marcoperinidev/java-aulab-course/new/master/flow-crm
cd flow-crm
npm install
mvn install
```

To run the application, run "mvn jetty:run" and open http://localhost:8080/ .

Debugging client side code

run "mvn vaadin:run-codeserver" on a separate console while the application is running
activate Super Dev Mode in the debug window of the application
To produce a deployable production mode WAR:

change productionMode to true in the servlet class configuration (nested in the UI class)
run "mvn clean package"
test the war file with "mvn jetty:run-war"
