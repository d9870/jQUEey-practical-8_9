<?php
//connect to the database mongodb
$m = new MongoDB\Driver\Manager("mongodb://localhost:27017");


echo "Connection to database successfully <br>";

//Insert Document into the collection

// $bulkWrite = new MongoDB\Driver\BulkWrite;
// $doc = ['name' => 'John', 'age' => 33, 'profession' => 'Guess what?'];
// $bulkWrite->insert($doc);

// $m->executeBulkWrite('TYITDB1.TYITCOL', $bulkWrite);


// echo "Data inserted successfully";

//read data from the database


// $filter = [];
// $options = [];
// $query = new MongoDB\Driver\Query($filter, $options);
// $cursor = $m->executeQuery('TYITDB1.TYITCOL', $query);

// foreach ($cursor as $document) {
//     echo "<table>";

//     echo "<tr>";
//     echo "<td>" . $document->name . "</td><br>";
//     echo "<td>" . $document->age . "</td><br>";
//     echo "<td>" . $document->RollNo . "</td><br>";
//     echo "</tr>";
//     echo "</table>";
// }

// // optional for one document
// foreach ($cursor as $document) {
//     echo $document->name, "\n";
// }


//update data in the database

// $bulkWrite = new MongoDB\Driver\BulkWrite;
// $filter = ['name' => 'Ram'];
// $update = ['$set' => ['name' => 'Smith', age => 35, RollNo => 3546, Project => 'Guess what?']];
// $options = ['multi' => false, 'upsert' => false];
// $bulkWrite->update($filter, $update, $options);
// $m->executeBulkWrite('TYDB.tydata', $bulkWrite);
// echo "Data updated successfully";

//delete data from the database

$bulkWrite = new MongoDB\Driver\BulkWrite;
$filter = ['name' => 'John', 'age' => 33];
$options = ['limit' => 20];
$bulkWrite->delete($filter, $options);
$m->executeBulkWrite('TYITDB1.TYITCOL', $bulkWrite);

echo "Data deleted successfully";




//select a database