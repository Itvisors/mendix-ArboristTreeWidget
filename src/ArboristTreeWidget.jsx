import { ArboristTree } from "./components/ArboristTree";
import { createElement } from "react";

// eslint-disable-next-line sort-imports
import "./ui/ArboristTreeWidget.css";

export function ArboristTreeWidget({ sampleText }) {
    return <ArboristTree sampleText={sampleText} />;
}
