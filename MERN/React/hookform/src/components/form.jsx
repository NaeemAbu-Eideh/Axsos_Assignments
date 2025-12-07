import React, {useState} from "react";


const Form = ()=>{
    const [fname, setFname] = useState("");
    const [lname, setLname] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");

    return (
        <>
            <form className="mx-auto w-350 mt-10">
                <div className="mb-10 flex justify-between mx-auto w-200">
                    <lable className="font-bold text-2xl">First Name: </lable>
                    <input type={"text"} className="pl-3 border w-100" onChange={(e) => setFname(e.target.value)} value={fname} placeholder="First Name" />
                </div>
                <div className="mb-10 flex justify-between mx-auto w-200">
                    <lable className="font-bold text-2xl">Last Name: </lable>
                    <input type={"text"} className="pl-3 border w-100" onChange={(e) => setLname(e.target.value)} value={lname} placeholder="Lirst Name" />
                </div>
                <div className="mb-10 flex justify-between mx-auto w-200">
                    <lable className="font-bold text-2xl">Email: </lable>
                    <input type={"email"} className="pl-3 border w-100" onChange={(e) => setEmail(e.target.value)} value={email} placeholder="Email" />
                </div>
                <div className="mb-10 flex justify-between mx-auto w-200">
                    <lable className="font-bold text-2xl">Password: </lable>
                    <input type={"password"} className="pl-3 border w-100" onChange={(e) => setPassword(e.target.value)} value={password} placeholder="Password" />
                </div>
                <div className="mb-10 flex justify-between mx-auto w-200">
                    <lable className="font-bold text-2xl">Confirm Password: </lable>
                    <input type={"password"} className="pl-3 border w-100" onChange={(e) => setConfirmPassword(e.target.value)} value={confirmPassword} placeholder="Confirm Password" />
                </div>
            </form>
            <hr/>
            <div className="w-200 mx-auto mt-10">
                <p className="font-bold text-3xl mb-6">Form:</p>
                <div className="mb-10 flex justify-between">
                    <p className="font-bold text-2xl">First Name:</p>
                    <p className="font-bold text-2xl">{fname}</p>
                </div>
                <div className="mb-10 flex justify-between">
                    <p className="font-bold text-2xl">Last Name:</p>
                    <p className="font-bold text-2xl">{lname}</p>
                </div>
                <div className="mb-10 flex justify-between">
                    <p className="font-bold text-2xl">Email:</p>
                    <p className="font-bold text-2xl">{email}</p>
                </div>
                <div className="mb-10 flex justify-between">
                    <p className="font-bold text-2xl">Password:</p>
                    <p className="font-bold text-2xl">{password}</p>
                </div>
                <div className="mb-10 flex justify-between">
                    <p className="font-bold text-2xl">Confirm Password:</p>
                    <p className="font-bold text-2xl">{confirmPassword}</p>
                </div>
            </div>


        </>
    );
};

export default Form;