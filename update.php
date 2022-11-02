<?php
$m -> new MongoDB\Driver\Manager("mongodb://localhost:27017");
$db = $m -> selectDB('TYITDB1');
$collection = $db -> selectCollection('TYITCOL');
$collection -> update(array("name" => "Deepak"), array('$set' => array("name" => "Deepak", "age" => 23, "RollNo" => 229749, "Project" => "Guess what?")));
echo "Data updated successfully";
?>


// $m->MongoClient();
// $db = $m->selectDB('TYITDB1');
// $collection = $db->selectCollection('TYITCOL');
// // update data
// $collection->update(
//     array("name" => "Deepak"),
//     array('$set' => array( "age" => 35))
// );
// echo "Data updated successfully";
