<?php

$m = new MongoDB\Driver\Manager("mongodb://localhost:27017");


echo "Connection to database successfully <br>";
$bulkWrite = new MongoDB\Driver\BulkWrite;
$doc = ['name' => 'Deepak', 'class' => 'TYIT', 'Rollno' => '229749'];
$bulkWrite->insert($doc);

$m->executeBulkWrite('TYITDB1.TYITCOL', $bulkWrite);


echo "Data inserted successfully";













// $m->MongoClient();
// $db = $m->selectDB('TYITDB1');
// $collection = $db->selectCollection('TYITCOL');
// $document = array(
//     "name" => "Deepak",
//     "age" => 23,
//     "RollNo" => 229749,
//     "Project" => "Guess what?"

// );

//Insert Document into the collection



// $collection->insert($document);
// echo "Data inserted successfully";
 ?>