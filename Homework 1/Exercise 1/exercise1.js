let person = {
    firstname: "John",
    lastname: "Doe",
    age: 50,
}

let professor = {
    __proto__: person,
    position: "honorary professor",
    level: "W1",
    chair: "Chair of Greek mythology",

    getDescription(){
        return `${this.firstname} ${this.lastname}, ${this.chair}`;
    },

    getInfo(){
        return `${this.getDescription()}, ${this.level} ${this.position}`;
    }
}

// Roles - START

let roleHeadOfExaminationBoard = {
    getInfo(){
        return `${this.__proto__.getInfo()}, head of the examination board`;
    },
    getDescription(){
        return `${this.__proto__.getDescription()}, head of the examination board`;
    }
}

let roleHeadOfDepartment = {
    getInfo(){
        return `${this.__proto__.getInfo()}, head of the department`;
    },
    getDescription(){
        return `${this.__proto__.getDescription()}, head of the department`;
    }
}

// Roles - END

function assignRole(role, member){
    role.__proto__ = member;
    return role;
}

// Assign roles
let headOfExaminationBoard = assignRole(roleHeadOfExaminationBoard, professor).getInfo();
let headOfDept = assignRole(roleHeadOfDepartment, professor).getInfo();


// Output professor with role 'head of examination board'

console.log(headOfExaminationBoard);

// Output professor with role 'head of department'

console.log(headOfDept);