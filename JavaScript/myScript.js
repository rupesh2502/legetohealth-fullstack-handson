function validateForm(){
    var form = document.simpleForm;
    var user = form.un;
    var pass = form.pwd;
    if(user.length < 1){
        alert("User can't be empty");
        return false;
    }
    if(pass.length < 1){
        alert("Password can't be empty");
        return false;
    }
}