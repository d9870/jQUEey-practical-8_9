<?php

$m->MongoClient();
$db = $m->selectDB('TYITDB1');
$collection = $db->selectCollection('TYITCOL');
// update data
$collection->update(
    array("name" => "Deepak"),
    array('$set' => array( "age" => 35))
);
echo "Data updated successfully";
?>