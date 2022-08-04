// Optional<T> was introduced in java 8 to deal with null values 
// It is a container type for a value with may be absent

// Consider the following function
// User findUserById(String userId) { ... };
// If userId is not present in the database then the above function returns null
  
// Consider the following code written by a client - a common NullPointerException situation
// User user = findUserById("83274");
// System.out.println("User's Name = " + user.getName());

// How Optional will help to mitigate the risk of running into NullPointerException:

Optional<User> findUserById(String userId) {}
// By returning Optional<User> from the function, there might not be a User with the given userId.

//the client needs to implement the optional check
Optional<User> optional = findUserById("83274");
optional.ifPresent(user -> {System.out.println("User's name = " + user.getName());})
  
//Create an empty optional
Optional<User> user = Optional.empty();

//create an optional with a non-null value
User user = new User("4444", "Raquel");
Optional<User> userOptional = Optional.of(user);

//create an optional with a value that may or may not be null
Optional<User> userOptional = Optional.ofNullable(user);

//CHECKING THE PRESENCE OF A VALUE
//isPresent()
if (optional.isPresent()) {
  optional.get();
} else {
  System.out.println("Optional empty");
}

//ifPresent()
optional.ifPresent(value -> {
  //do something
})
  
//retrieving the value using get()
User user = optional.get();

//orElse() is great when you want to return a default value if the Optional is empty
// return "Unknown User" if user is null - WITHOUT orElse()
User finalUser = (user != null) ? user : new User("0", "Unknown User");

// return "Unknown User" if user is null - with orElse()
User finalUser = optionalUser.orElse(new User("0", "Unknown User"));

//orElseGet() allows to pass a suplier function
User finalUser = optionalUser.orElseGet(() -> {
  return new User("0", "Unknown User");
});

//orElseThrow() to throw an exception if Optional is empty.
@GetMapping("/users/{userId}")
public User getUser(@PathVariable("userId") String userId) {
    return userRepository.findByUserId(userId).orElseThrow(
	    () -> new ResourceNotFoundException("User not found with userId " + userId);
    );
}

//Filtering values using filter()
//version without filter()
if(user != null && user.getGender().equalsIgnoreCase("MALE")) {
    // call a function
}

//version with filter()
userOptional.filter(user -> user.getGender().equalsIgnoreCase("MALE"))
.ifPresent(() -> {
    // Your function
})
  
//Extracting and transforming values using map()
  //Considering the following getAddress() method inside User class
Address getAddress() {
    return this.address;
}

//without map()
if(user != null) {
    Address address = user.getAddress();
    if(address != null && address.getCountry().equalsIgnoreCase("India")) {
	    System.out.println("User belongs to India");
    }
}

//with map()
userOptional.map(User::getAddress)
.filter(address -> address.getCountry().equalsIgnoreCase("India"))
.ifPresent(() -> {
    System.out.println("User belongs to India");
});

//understanding the last code above in more details
// Extract User's address using map() method.
Optional<Address> addressOptional = userOptional.map(User::getAddress)

// filter address from India
Optional<Address> indianAddressOptional = addressOptional.filter(address -> address.getCountry().equalsIgnoreCase("India"));

// Print, if country is India
indianAddressOptional.ifPresent(() -> {
    System.out.println("User belongs to India");
});


//cascading optional with flatMap()
Optional<Address> addressOptional = userOptional.flatMap(User::getAddress)
