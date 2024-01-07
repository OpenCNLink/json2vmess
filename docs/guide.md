# VmessConverter User Guide

VmessConverter is a Java tool for converting JSON-formatted configurations to vmess urls. By using VmessConverter, you can easily convert a JSON-formatted configuration to a vmess URL for use in software such as v2ray.

## Usage

First, make sure that you have configured your java development environment correctly and that you have saved the VmessConverter code in a file called 'vmessconverter.java'.

Next, you can use the VmessConverter tool by following these steps:

1. Open the terminal or command prompt window.
2. Navigate to the directory containing the 'VmessConverter.java' file.
3. Compile the Java code: type 'javac VmessConverter.java' on the command line and press Enter.
4. Run the program: Enter 'java VmessConverter <jsonString>' in the command line and press Enter. Note that '<jsonString>' should be replaced with the actual JSON string that you want to convert.
- If the command line parameters are incorrect, the program displays a usage prompt.
- After correct execution, the program will output the generated vmess address.

## Example

Here is an example of using VmessConverter:

Suppose you have a JSON configuration string that looks like this:

```json
{
"v": "2",
"ps": "My Vmess Server",
"add": "example.com",
"port": 443,
"id": "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
"aid": "64",
"net": "tcp",
"type": "none",
"tls": true,
"host": "example.com"
}
` ` `

You can convert it to a vmess URL by following these steps:

1. Open the terminal or command prompt window.
2. Navigate to the directory containing the 'VmessConverter.java' file.
3. Compile the Java code: type 'javac VmessConverter.java' on the command line and press Enter.
4. Run the program: At the command line input ` Java VmessConverter "{\ \" v ": \ \" 2 ", \ "ps \" : \ "My Vmess Server\",\"add\":\"example.com\",\"port\":443,\"id\":\"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx\",\"aid\":\"64\",\"net\":\"t Cp \ ", \ "type \" : \ "none \", \ "the TLS \" : true, \ "the host \", \ "example.com \ \"} "` and press the enter key.
- Note: The escape character '\' is used to escape the double quotes' "', ensuring that the JSON string is passed to the program correctly.
5. The program will output the generated vmess address, similar to 'Vmess address: vmess://eyJ2IjoiMiIsInBzIjoiTXkgVm1lc3MgU2VydmVyIiwiYWRkIjoiZXhhbXBsZS5jb20iLCJwb3J0Ijo0NDMsImlkIjoieHh4eHh4eC14eHh4LXh4 eC14eHh4LXh4eHh4LXh4eHh4eHh4IiwiYWlkIjoiNjQiLCJuZXQiOiJ0Y3AiLCJ0eXBlIjoibm9uZSIsInRscyI6dHJ1ZSwiaG9zdCI6ImV4YW1wbGUuY29t In0= '.

You can now use the generated vmess address in the corresponding v2ray and other software.

## Precautions

Make sure that you have configured your Java development environment correctly and that you have set the correct path on the command line.
- Use the correctly formatted JSON string as input, making sure it matches the format in the example.
- If you don't have a specific field in your JSON string (for example, "host"), you can omit the corresponding field.
- Please modify the code to meet your needs.
