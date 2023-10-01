import { ArboristTree } from "./components/ArboristTree";
import { createElement } from "react";

export function preview({ sampleText }) {
    return <ArboristTree sampleText={sampleText} />;
}

export function getPreviewCss() {
    return require("./ui/ArboristTreeWidget.css");
}
