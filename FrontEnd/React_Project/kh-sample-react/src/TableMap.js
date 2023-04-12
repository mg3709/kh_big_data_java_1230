import React from "react";
import "./App.css";


const TableMap = () => {
    const data = [
        {id:100, name:"카즈하", age:21},
        {id:200, name:"유나", age:21},
        {id:300, name:"안유진", age:21}
    ];

    const tableClickEvent = (item) => {
        console.log(item);
    }
    return(
        <table>
            <thead>
                <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                </tr>
            </thead>
            <tbody>
                {data.map(item => (
                    <tr key={item.id} onClick={() => tableClickEvent(item)}>
                    <td>{item.id}</td>
                    <td>{item.name}</td>
                    <td>{item.age}</td>
                </tr>
                ))}
            </tbody>
        </table>
    );
};

export default TableMap;