import { createElement, useState } from "react";
import { ArboristTree } from "./components/ArboristTree";

// eslint-disable-next-line sort-imports
import "./ui/ArboristTreeWidget.css";

export function ArboristTreeWidget(props) {
    const [dataChangedDate, setDataChangedDate] = useState(null);

    if (props.logToConsole) {
        logMessageToConsole("onClickExportButton: No table data");
    }
    const data = [
        { id: "1", name: "Unread" },
        { id: "2", name: "Threads" },
        {
            id: "3",
            name: "Chat Rooms",
            children: [
                { id: "c1", name: "General" },
                { id: "c2", name: "Random" },
                { id: "c3", name: "Open Source Projects" }
            ]
        },
        {
            id: "4",
            name: "Direct Messages",
            children: [
                { id: "d1", name: "Alice" },
                { id: "d2", name: "Bob" },
                { id: "d3", name: "Charlie" }
            ]
        }
    ];

    return <ArboristTree data={data} />;

    function logMessageToConsole(message) {
        console.info(this.props.name + " " + new Date().toISOString() + " (widget) " + message);
    }
}
