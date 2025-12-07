import React, {useState} from "react";


const Form = ()=>{
    const [fname, setFname] = useState("");
    const [lname, setLname] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");

    const [fnameError, setFnameError] = useState("");
    const [lnameError, setLnameError] = useState("");
    const [emailError, setEmailError] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [confirmPasswordError, setConfirmPasswordError] = useState("");

    const setFnameErrorMeesage = (e) =>{
        setFname(e.target.value);

        if(fname.length < 2){
            setFnameError("The first name must be at least 2 characters");
        }
        else{
            setFnameError("");
        }
    }

    const setLnameErrorMeesage = (e) =>{
        setLname(e.target.value);

        if(lname.length < 2){
            setLnameError("The last name must be at least 2 characters");
        }
        else{
            setLnameError("");
        }
    }

    const setEmailErrorMeesage = (e) =>{
        setEmail(e.target.value);

        if(email.length < 5){
            setEmailError("The email must be at least 5 characters");
        }
        else{
            setEmailError("");
        }
    }

    const setPasswordErrorMeesage = (e) =>{
        setPassword(e.target.value);

        if(password.length < 8){
            setPasswordError("The password must be at least 8 characters");
        }
        else{
            setPasswordError("");
        }
    }

    const setConfirmPasswordErrorMeesage = (e) =>{
        setConfirmPassword(e.target.value);

        if(password !== confirmPassword){
            setConfirmPasswordError("Passwords must match");
        }
        else{
            setConfirmPasswordError("");
        }
    }


    return (
        <>
            <form className="mx-auto w-350 mt-10">
                <div className="mx-auto w-200">
                    <p className="text-red-600 mx-auto w-200 mb-3">{fnameError}</p>
                    <div className="mb-10 flex justify-between">
                        <lable className="font-bold text-2xl">First Name: </lable>
                        <input type={"text"} className="pl-3 border w-100" onChange={(e) => setFnameErrorMeesage(e)} value={fname} placeholder="First Name" />
                    </div>
                </div>
                <div className="mx-auto w-200">
                    <p className="text-red-600 mx-auto w-200 mb-3">{lnameError}</p>
                    <div className="mb-10 flex justify-between">
                        <lable className="font-bold text-2xl">Last Name: </lable>
                        <input type={"text"} className="pl-3 border w-100" onChange={(e) => setLnameErrorMeesage(e)} value={lname} placeholder="Lirst Name" />
                    </div>
                </div>
                <div className="mx-auto w-200">
                    <p className="text-red-600 mx-auto w-200 mb-3">{emailError}</p>
                    <div className="mb-10 flex justify-between">
                        <lable className="font-bold text-2xl">Email: </lable>
                        <input type={"email"} className="pl-3 border w-100" onChange={(e) => setEmailErrorMeesage(e)} value={email} placeholder="Email" />
                    </div>
                </div>
                <div className="mx-auto w-200">
                    <p className="text-red-600 mx-auto w-200 mb-3">{passwordError}</p>
                    <p className="text-red-600 mx-auto w-200 mb-3">{confirmPasswordError}</p>
                    <div className="mb-10 flex justify-between">
                        <lable className="font-bold text-2xl">Password: </lable>
                        <input type={"password"} className="pl-3 border w-100" onChange={(e) => setPasswordErrorMeesage(e)} value={password} placeholder="Password" />
                    </div>
                </div>
                <div className="mx-auto w-200">
                    <div className="mb-10 flex justify-between">
                        <lable className="font-bold text-2xl">Confirm Password: </lable>
                        <input type={"password"} className="pl-3 border w-100" onChange={(e) => setConfirmPasswordErrorMeesage(e)} value={confirmPassword} placeholder="Confirm Password" />
                    </div>
                </div>
            </form>
        </>
    );
};

export default Form;