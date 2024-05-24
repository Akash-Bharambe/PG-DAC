
const accounts = [
    {
        "accountId": "12",
        "accountName": "Akash Bharambe",
        "accountType": "Current",
        "accountBalance": "456456456",
        "creationDate": "2024-05-30"
    },
    {
        "accountId": "12",
        "accountName": "Chinmay Kapote",
        "accountType": "Joint",
        "accountBalance": "456456456",
        "creationDate": "2024-05-30"
    },
    {
        "accountId": "4",
        "accountName": "Abhijeet Patil",
        "accountType": "Joint",
        "accountBalance": "456456456",
        "creationDate": "2024-05-30"
    }
]

function Account() {
  return (
    <table>
      <thead>
        <th>Account ID</th>
        <th>Account Name</th>
        <th>Account Type</th>
        <th>Balance</th>
        <th>Creation Date</th>
      </thead>
      <tbody>
        {accounts.map((a,i)=>
        <tr key={i} >
            <td>{a.accountId}</td>
            <td>{a.accountName}</td>
            <td>{a.accountType}</td>
            <td>{a.accountBalance}</td>
            <td>{a.creationDate}</td>
        </tr>
        )}
      </tbody>
    </table>
  )
}

export default Account
