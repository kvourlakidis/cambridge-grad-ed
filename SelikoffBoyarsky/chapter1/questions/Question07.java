// GIVEN THE FOLLOWING CLASSES
package aquarium;
public class Water {
  boolean salty = false;
}
///////////////////////////////
package aquarium.jellies;
public class Water {
  boolean salty = true;
}
///////////////////////////////
package employee;

// import aquarium.*;                                 // fine 
// import aquarium.Water; import aquarium.jellies.*;  // crazy but will work
// import aquarium.*; import aquarium.jellies.Water;  // same as above 
// import aquarium.*; import aquarium.jellies.*;      // won't work - class name ambiguity
// import aquarium.Water; import aquarium.jellies.Water; // won't work - class name ambiguity

public class WaterFiller {
  Water water;
}

// Which of the above imports will make the code compile?
